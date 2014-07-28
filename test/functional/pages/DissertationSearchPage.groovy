package pages

class DissertationSearchPage extends FormPage {
    static url = "dissertacao/search"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def currentTese = gp.msg("default.dissertacao.label")
        def currentTitle = gp.msg("default.search.label", [currentTese])
        title ==~ currentTitle
    }

    def fillDissertationSearchDetails(title, initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school) {
        fillTitleInSearchDetails(title)
        fillSomeDetaisInSearch(initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school)
    }

    def fillTitleInSearchDetails(title) {
        $("form").title = title
    }

    def fillSomeDetaisInSearch(initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school)  {
        $("form").publicationInitialDate_day= initialDay
        $("form").publicationInitialDate_month = initialMonth
        $("form").publicationInitialDate_year = initialYear
        $("form").publicationEndDate_day= endDay
        $("form").publicationEndDate_month = endMonth
        $("form").publicationEndDate_year = endYear
        $("form").school = school
    }

    def searchDissertations() {
        $("input", id:"search").click()
    }

}