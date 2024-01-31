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

WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/label_Cari_Mobil_Impian'))

'Arahkan pointer ke menu Header Jual Mobil'
WebUI.mouseOver(findTestObject('Jual_Cepat/Menu_Jual_Cepat/button_Jual_Mobil'))

'Klik submenu Jual Cepat'
WebUI.click(findTestObject('Jual_Cepat/Menu_Jual_Cepat/button_Jual_Cepat'))

'memastikan user direct ke halaman jual cepat'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Menu_Jual_Cepat/label_cek_estimasi_harga_mobilmu'), FailureHandling.STOP_ON_FAILURE)

'screenshot user direct ke halaman jual cepat'
WebUI.takeScreenshot()

'memastikan kolom input merek mobil muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Cek_Merek_Mobil'))

'memastikan kolom input model mobil muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Pilih_Model'))

'memastikan kolom input tahun produksi muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/dropdownlist_Tahun_Produksi'))

'memastikan kolom input kilometer muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Masukan_Kilometer'))

'memastikan kolom input ekspektasi harga muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Ekspektasi_Harga'))

'memastikan tombol cek harga muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/button_Cek_Harga'))

'input invalid merek mobil'
WebUI.setText(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Cek_Merek_Mobil'), 'honds')

WebUI.sendKeys(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Cek_Merek_Mobil'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/label_Merek_tidak_ditemukan'))

WebUI.takeScreenshot()

