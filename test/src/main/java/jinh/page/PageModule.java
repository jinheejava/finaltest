package jinh.page;

import org.springframework.beans.factory.annotation.Autowired;

import jinh.bbs.model.BbsDAO;

public class PageModule {
	
	/* 페이지 필수 요소
	 * 1. 총 게시물 수
	 * 2. 한 화면에 보여줄 리스트 수
	 * 3. 한 화면에 보여줄 페이징 수
	 * 4. 사용자의 현재위치
	 */
	
	@Autowired
	private BbsDAO bbsDao;

	public static String page(String pagename, int totalcnt, int listsize, int pagesize, int cp){
		
		int totalpage = totalcnt/listsize+1;
		if(totalcnt%listsize==0) totalpage++;
		
		int usergroup = cp/pagesize;
		if(cp%pagesize==0) usergroup--;
		
		StringBuffer str = new StringBuffer();
		
		if(usergroup!=0){
			str.append("<a href='");
			str.append(pagename);
			str.append("?cp=");
			int temp =  (usergroup-1)*pagesize+pagesize;
			str.append(temp);
			str.append("'> &lt;&lt; </a>");
			
		}
		
		for(int i=usergroup*pagesize+1;i<=usergroup*pagesize+pagesize;i++){
			str.append("&nbsp;&nbsp; <a href='");
			str.append(pagename);
			str.append("?cp=");
			str.append(i);
			str.append("'>");
			str.append(i);
			str.append("</a> &nbsp;&nbsp;");
			
			if(i==totalpage) break;			
		}
		
		if(usergroup!=((totalpage/pagesize)-(totalpage%pagesize==0?1:0))){
			str.append("<a href='");
			str.append(pagename);
			str.append("?cp=");
			int temp = (usergroup+1)*pagesize+1;
			str.append(temp);
			str.append("'> &gt;&gt; </a>");
			
		}
		
		return str.toString();
	}
}



















