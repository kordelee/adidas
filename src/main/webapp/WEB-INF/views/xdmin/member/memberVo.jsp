<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<input type="hidden" name="thisPage" value="<c:out value="${vo.thisPage}" default="1"/>">
<input type="hidden" name="rowNumToShow" value="<c:out value="${vo.rowNumToShow}"/>">

<input type="hidden" name="shOption" value="<c:out value="${vo.shOption}"/>"/>
<input type="hidden" name="shValue" value="<c:out value="${vo.shValue}"/>"/>

	private String shOption = "";
	private String ShValue = "";
	private Integer shDelNy = 0;
	private Integer shDateOption = 0;
	private Date shStartDate;
	private Date shEndDate;





<%-- 
<input type="hidden" name="thisPage" value="<c:out value="${param.thisPage}" default="1"/>"/>
<input type="hidden" name="rowNumToShow" value="<c:out value="${param.rowNumToShow}" default="10"/>"/>
<input type="hidden" name="searchValue" value="<c:out value="${param.searchValue}"/>"/>
<input type="hidden" name="gubun" value="<c:out value="${param.gubun}"/>"/>

<input type="hidden" name="sh_auth" value="<c:out value="${param.sh_auth}"/>"/>
<input type="hidden" name="sh_AUTH_SEQ" value="<c:out value="${param.sh_AUTH_SEQ}"/>"/>
 --%>