<%@page import="rgms.member.Member"%>
<%@page import="rgms.publication.Dissertacao" %>

<div class="fieldcontain">
	<label for="title">
		<g:message code="dissertacao.title.label" default="Title" />
	</label>
	<g:textField id="title" name="title" value="${dissertacaoInstance?.title}"/>
</div>

<div class="fieldcontain">
	<label for="publicationInitialDate">
		<g:message code="dissertacao.publicationInitialDate.label" default="Initial Date" />
	</label>
	<g:datePicker name="publicationInitialDate" precision="day"  value="${dissertacaoInstance?.publicationDate}"  />
</div>

<div class="fieldcontain">
    <label for="publicationEndDate">
        <g:message code="dissertacao.publicationEndDate.label" default="End Date" />
    </label>
    <g:datePicker name="publicationEndDate" precision="day"  value="${dissertacaoInstance?.publicationDate}"  />
</div>

<div class="fieldcontain">
	<label for="school">
		<g:message code="dissertacao.school.label" default="School" />
	</label>
	<g:textField name="school" value="${dissertacaoInstance?.school}"/>
</div>

