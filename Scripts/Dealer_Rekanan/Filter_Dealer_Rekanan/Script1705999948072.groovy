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

'hover mouse ke mitra dealer'
WebUI.mouseOver(findTestObject('Home_Page/hyperlink_MitraDealer'))

'verifikasi button dealer rekanan terlihat'
WebUI.verifyElementVisible(findTestObject('Home_Page/button_DealerRekanan'))

'ambil screenshot'
WebUI.takeScreenshot()

'klik button dealer rekanan'
WebUI.click(findTestObject('Home_Page/button_DealerRekanan'))

'verifikasi teks "dealer rekanan"'
WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_DealerRekanan'), 'dealer rekanan')

'ambil screenshot'
WebUI.takeScreenshot()

'scroll ke posisi tertentu'
WebUI.scrollToPosition(20, 0)

'ambil screenshot'
WebUI.takeScreenshot()

'input teks lokasi'
WebUI.setText(findTestObject('Dealer_Rekanan_Page/textbox_Lokasi'), GlobalVariable.JAKARTASELATAN)

'ambil screenshot'
WebUI.takeScreenshot()

'klik dropdown lokasi'
WebUI.click(findTestObject('Dealer_Rekanan_Page/dropdown_LokasiJakartaSelatan'))

'scroll ke posisi tertentu'
WebUI.scrollToPosition(35, 0)

'verifikasi teks yang muncul pada filter'
WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_MenampilkanDaerahSTRONG'), GlobalVariable.JAKARTASELATAN)

'verifikasi element region tidak bisa diklik'
WebUI.verifyElementNotClickable(findTestObject('Dealer_Rekanan_Page/textbox_Region'))

'delay 2 detik'
WebUI.delay(2)

'ambil screenshot'
WebUI.takeScreenshot()

'klik x pada filter lokasi'
WebUI.click(findTestObject('Dealer_Rekanan_Page/button_Xlokasi'))

'input teks pada field region'
WebUI.setText(findTestObject('Dealer_Rekanan_Page/textbox_Region'), GlobalVariable.JABAR)

'ambil screenshot'
WebUI.takeScreenshot()

'klik dropdown jabar'
WebUI.click(findTestObject('Dealer_Rekanan_Page/dropdown_RegionJabar'))

'verifikasi teks yang muncul pada filter'
WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_MenampilkanDaerahSTRONG'), GlobalVariable.JABAR)

'ambil screenshot'
WebUI.takeScreenshot()

'verifikasi element tidak bisa diklik'
WebUI.verifyElementNotClickable(findTestObject('Dealer_Rekanan_Page/textbox_Lokasi'))

