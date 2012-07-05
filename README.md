struts-performance
==================
[Update]
While the problem shows in commit https://github.com/mmalmeida/struts-performance/commit/aba93098174c8c8c1684ffdd9bf332b212a893a,
it's not present in the latest commit if you turn devMode to false. The issue was the freemarker version 2.3.9 in that commit.
Updating to 2.3.19 makes performance normal again.

Run the maven goal jetty:run and browse to http://localhost:8080.


See the performance issue - >6 seconds to load the page.

Then, in index.jsp, replace the contents:

  				<s:a href="%{url}">
						<s:property value="%{#subchapter.title}" />
					</s:a>
        
        
with 
          xxx
          
See how the page loads much faster