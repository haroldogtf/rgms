package pages

import geb.Page

class DissertationSearchListPage extends Page {

    static url = "dissertacao/searchList"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def currentTese = gp.msg("default.dissertacao.label")
        def currentTitle = gp.msg("default.list.label", [currentTese])
        title ==~ currentTitle
    }

    def getRow() {
        def listDiv = $('div', id: 'list-dissertacao')
        def dissertationTable = (listDiv.find('table'))[0]
        def dissertationRow = dissertationTable.find('tbody').find('tr')
        return dissertationRow
    }

    def selectViewDissertation(title) {
        def showLink = getRow().find('td').find([text: title])
        showLink.click()
    }

    def checkIfDissertationWasFound(title) {
        def dissertation = getRow().find('td').find([text: title])
        assert dissertation != null
    }
}
