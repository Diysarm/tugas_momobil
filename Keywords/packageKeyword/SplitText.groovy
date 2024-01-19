

package packageKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SplitText {

	@Keyword
	def stringToInteger(String record) {
		String [] recordSelect = record.split(" ")
		String result1 = recordSelect[1]
		println(result1)
		int result2 = result1.toInteger()
		println(result2)
		return result2
	}


	@Keyword
	def splitTextMobil(int result2, TestObject objectMobil) {
		List<String> firstWords = []
		def merk = WebUI.getText(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))
		for (int i = 1; i <= result2; i++) {
			String mobil = WebUI.getText(findTestObject('Object Repository/Dealer_Rekanan_Page/label_HeaderMobil', [('i') : i]))
			def resultArray = mobil.split(" ")
			def firstWord = resultArray[0]
			println("Nilai merk: ${merk}, Nilai mobil: ${mobil} Nilai pertama mobil: ${firstWord}")
			firstWords.add(firstWord)

			if(merk.equalsIgnoreCase(firstWord)) {
				println('Filter sudah sesuai')
			}else {
				println('filter tidak sesuai')
			}
		}
		return firstWords
	}
}
