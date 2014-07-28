package pages

import org.aspectj.weaver.patterns.WithinCodeAnnotationPointcut;
import org.hibernate.hql.ast.HqlSqlWalker.WithClauseVisitor;

import geb.Page;


class DissertationShowPage extends Page{
	static url = "dissertacao/show"
	
	static at = {
		title ==~ /Ver Dissertacao/
	}
	
	static content = {
		
	}
	
	def editDissertation(){
		$('a.edit').click()
	}
	
	def deleteDissertation(){
		assert withConfirm(true) {
			$('input.delete').click()
		}
	}

    def checkDissertationDetails(title, year, school) {
        def elements = $('div', id: 'show-dissertacao').find('ol')[0].find('li.fieldcontain span[aria-labelledby]')

        assert elements[0].text() == title
        assert elements[1].text().split('/')[2].split(' ')[0] == year
        assert elements[3].text() == school
    }
}
