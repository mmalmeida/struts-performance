<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<s:action name="menu" executeResult="false" var="menu" />
<s:actionerror />
<s:iterator value="%{#menu.bookIndex}" status="row" var="chapterIndex">
	<s:set var="chapter" value="%{#chapterIndex.key}" />
	<s:set var="subchapters" value="%{#chapterIndex.value}" />
	<br>
	<s:url id="url" action="chapterloadPage">
		<s:param name="page">${chapter.title}</s:param>
	</s:url>
	<s:a href="%{url}">${chapter.title}</s:a>
	<table>
		<s:iterator value="subchapters" status="ind" var="subchapter">
			<s:url id="url" action="chapterloadPage">
				<s:param name="page">
					<s:property value="subchapter.title" />
				</s:param>
			</s:url>
			<tr>
				<td style="font-size: smaller;">
					<s:a href="%{url}">
						<s:property value="%{#subchapter.title}" />
					</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
</s:iterator>