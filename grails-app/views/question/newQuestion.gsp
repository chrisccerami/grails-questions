<g:form name="questionForm" url="[controller:'question',action:'create']">
    <p>Title
        <g:textField name="title"/>
    </p>
    <p>Body
        <g:textArea name="body"/>
    </p>
    <p>Your Name
        <g:textField name="asker"/>
    </p>
    <g:submitButton name="submit" value="Ask Question"/>
</g:form>