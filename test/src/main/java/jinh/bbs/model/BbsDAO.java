package jinh.bbs.model;

import java.util.List;

public interface BbsDAO {
	
	public List<BbsDTO> bbslist(int cp);
	
	public int bbsTotalcnt();
	

}
