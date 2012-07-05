package at.almeida;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author malmeida
 * 
 */
public class BookAction extends ActionSupport {
	Map<Chapter, List<Subchapter>> bookIndex;
	public Map<Chapter, List<Subchapter>> getBookIndex() {
		return bookIndex;
	}

	public void setBookIndex(Map<Chapter, List<Subchapter>> bookIndex) {
		this.bookIndex = bookIndex;
	}
	

	public String quickmenu() throws Exception {
    	bookIndex = new HashMap<Chapter, List<Subchapter>>();
    	
    	for (int chapter = 0; chapter < 20; chapter++) {
    		List<Subchapter> subchapters = new ArrayList<Subchapter>();
        	for (int i = 0; i < 20; i++) {
    			subchapters.add(new Subchapter("Subchapter " + i));
    		}
        	bookIndex.put(new Chapter("Chapter "+chapter), subchapters);
            
    	}
    	return SUCCESS;
	}
}
