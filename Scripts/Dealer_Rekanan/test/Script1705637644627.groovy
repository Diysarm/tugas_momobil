import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.clearText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'))

WebUI.setText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'), GlobalVariable.ThnProduksiMin)

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

WebUI.click(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

WebUI.delay(4)

jumlah = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

tahunProduksi = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah)

CustomKeywords.'packageKeyword.SplitText.verifyFilterTahun'(tahunProduksi, findTestObject('Dealer_Rekanan_Page/label_TahunMobilImg', 
        [(GlobalVariable.j) : GlobalVariable.j]))

