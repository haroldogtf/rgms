package pages

class DissertationCreate extends FormPage {
    static url = "dissertacao/create"

    static at = {
        title ==~ /Criar Dissertacao/
    }

    static content = {
        /*journal {
            $("input", id: "journal")
        }*/
    }

    def fillDissertationDetailsWithoutFile() {
        $("form").title = "Dissertacao Teste 1"
        $("form").school = "WebSite"
        $("form").address = "Description"
        $("form").create().click()
        // Could parametrize, obtaining data from class TestDataAndOperations
    }

    def fillDissertationDetailsWithFile(filename) {
        $("form").title = "Dissertacao Teste 1"
        $("form").file = filename
        $("form").school = "WebSite"
        $("form").address = "Description"
        $("form").create().click()
    }
    	
    def currentSchool() {
        $("form").school
    }

    def fillDissertationDetails(title, pub_day, pub_month, pub_year, school, address, path) {
        $("form").file = path
        fillSomeDissertationDetails(title, pub_day, pub_month, pub_year, school, address)
    }

    def fillSomeDissertationDetails(title, pub_day, pub_month, pub_year, school, address) {
        fillDissertationDetailsWithoutFile(title, pub_day, pub_month, pub_year, school, address)
        $("input", id: "create").click()
    }

    def fillDissertationDetailsWithoutFile(title, pub_day, pub_month, pub_year, school, address) {
        $("form").title = title
        $("form").publicationDate_day = pub_day
        $("form").publicationDate_month = pub_month
        $("form").publicationDate_year = pub_year
        $("form").school = school
        $("form").address = address
    }
	
}
