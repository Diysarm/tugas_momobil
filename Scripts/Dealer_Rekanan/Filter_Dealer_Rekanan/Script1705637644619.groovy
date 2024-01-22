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

WebUI.callTestCase(findTestCase('Login_Logout_Registrasi/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page/button_DealerRekanan'))

WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_DealerRekanan'), 'dealer rekanan')

WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_DealerAbadaiMegahMotor'), 0)

WebUI.click(findTestObject('Dealer_Rekanan_Page/button_DealerAbadaiMegahMotor'))

WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_AbadiMegahMotor'), 'ABADI MEGAH MOTOR')

WebUI.click(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))

WebUI.delay(4)

jumlah = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

mobil = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah)

CustomKeywords.'packageKeyword.SplitText.splitTextMobil'(mobil, findTestObject('Dealer_Rekanan_Page/label_HeaderMobil', 
        [(GlobalVariable.i) : GlobalVariable.i]))

