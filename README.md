struts-performance
==================


Run the maven goal jetty:run and browse to http://localhost:8080.


See the performance issue - >6 seconds to load the page.

Then, in index.jsp, replace the contents:

  				<s:a href="%{url}">
						<s:property value="%{#subchapter.title}" />
					</s:a>
        
        
with 
          xxx
          
See how the page loads much faster