package at.almeida.strutsPerformance.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;

import at.almeida.strutsPerformance.model.Chapter;
import at.almeida.strutsPerformance.model.Subchapter;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport {
	
	Map<Chapter, List<Subchapter>> bookIndex;
	public Map<Chapter, List<Subchapter>> getBookIndex() {
		return bookIndex;
	}

	public void setBookIndex(Map<Chapter, List<Subchapter>> bookIndex) {
		this.bookIndex = bookIndex;
	}
	

	@Action("/menu")
	public String menu() throws Exception {
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
    public String execute() throws Exception {

    	setMessage(getText(MESSAGE));            
    	return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }


}
