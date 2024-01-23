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

WebUI.mouseOver(findTestObject('Home_Page/hyperlink_MitraDealer'))

WebUI.verifyElementVisible(findTestObject('Home_Page/button_DealerRekanan'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Home_Page/button_DealerRekanan'))

WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_DealerRekanan'), 'dealer rekanan')

WebUI.takeScreenshot()

WebUI.scrollToPosition(20, 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Dealer_Rekanan_Page/button_DealerAbadaiMegahMotor'))

WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_AbadiMegahMotor'), 'ABADI MEGAH MOTOR')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

WebUI.takeScreenshot()

jumlah = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

mobil = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah)

CustomKeywords.'packageKeyword.SplitText.splitTextMobil'(mobil, findTestObject('Dealer_Rekanan_Page/label_HeaderMobil', 
        [(GlobalVariable.i) : GlobalVariable.i]))

WebUI.click(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'), 0)

WebUI.clearText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'), GlobalVariable.ThnProduksiMin)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

WebUI.click(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

WebUI.delay(4)

WebUI.takeScreenshot()

jumlah2 = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

tahunProduksi = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah2)

CustomKeywords.'packageKeyword.SplitText.verifyFilterTahun'(tahunProduksi, findTestObject('Dealer_Rekanan_Page/label_TahunMobilImg', 
        [(GlobalVariable.j) : GlobalVariable.j]))

