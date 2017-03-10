package jinh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jinh.bbs.model.BbsDAO;
import jinh.bbs.model.BbsDTO;

@Controller
public class BbsController {
	
	@Autowired
	private BbsDAO bbsDao;
	
	@RequestMapping("/bbs.do")
	public ModelAndView bbs(@RequestParam(value="cp", defaultValue="1") int cp){
		
		int totalcnt = bbsDao.bbsTotalcnt();
		int listsize = 7;
		int pagesize = 3;
		
		String page = jinh.page.PageModule.page("bbs.do", totalcnt, listsize, pagesize, cp);
		
		List<BbsDTO> list = bbsDao.bbslist(cp);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("page", page);
		mav.addObject("bbslist", list);
		mav.setViewName("bbs/bbslist");
		
		return mav;
				
	}
	

}
