package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;
import service.StudentService;

@Controller
public class StudentController {
	
	@Resource
	StudentService studentService;
	
	@RequestMapping("/allstudents.show")
	public ModelAndView findAllstudent(){
		List<Student> list=	studentService.findAllStudents();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/findstuByName.show")
	public ModelAndView findstudentbyname(String name){
		ModelAndView mv=new ModelAndView();
		try {
			name=new String(name.getBytes("iso-8859-1"),"utf-8");
			List<Student> list=	studentService.findStudentByName(name);
			mv.setViewName("index");
			mv.addObject("name", name);
			mv.addObject("list", list);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mv;
	}
	
	/*@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(String name,String pwd,Model model){
		Student stu=studentService.login(name, pwd);
		model.addAttribute("stu", stu);
		return "welcome";
	}*/
	/*@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(String name,String pwd,Map<String, Object> map){
		Student stu=studentService.login(name, pwd);
		map.put("stu", stu);
		return "redirect:/welcome.jsp";
	}*/
	
//	@RequestMapping(value="/login.do",method=RequestMethod.POST)
//	public String login(String name,String pwd,HttpServletRequest request){
//		Student stu=studentService.login(name, pwd);
//		request.getSession().setAttribute("stu", stu);
//		return "redirect:/welcome.jsp";//重新发送一个请求
//	}

	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(String name,String pwd,HttpSession session){
		double c=1/0;
		Student stu=studentService.login(name, pwd);
		session.setAttribute("stu", stu);
		System.out.println("用户名:"+stu);
		return "redirect:allstudents.show";//重新发送一个请求
	}
	
	@RequestMapping("/register.do")
	public void register(Student stu,HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int res=studentService.register(stu);
		try {
			PrintWriter out=response.getWriter();
			if(res!=0){
				out.print("<script type=\"text/javascript\">");
				out.print("alert(\"注册成功！\");");
				out.print("window.location.href=\"login.jsp\";");
				out.print("</script>");
			}else{
				out.print("<script type=\"text/javascript\">");
				out.print("alert(\"注册失败！\");");
				out.print("window.location.href=\"register.jsp\";");
				out.print("</script>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@ExceptionHandler({Exception.class})
	public String doexception(Exception e,HttpServletRequest request){
		System.out.println(e.getMessage());
		request.setAttribute("mes", e.getMessage());
		return "error";
	}
	
}
