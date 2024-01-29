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

'buka browser dan buka url uat momobil'
WebUI.openBrowser('https://uat.momobil.id/')

'maximize window browser'
WebUI.maximizeWindow()

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk'
WebUI.click(findTestObject('Home_Page/Button_Masuk'))

'verifikasi terdapat teks "masuk ke akun anda"'
WebUI.verifyTextPresent('masuk ke akun anda', true)

'ambil screenshot'
WebUI.takeScreenshot()

'klik button daftar disini'
WebUI.click(findTestObject('Login_Page/button_DaftarDisini'))

'verifikasi terdapat teks "daftar sekarang'
WebUI.verifyTextPresent('daftar sekarang', true)

'ambil screenshot'
WebUI.takeScreenshot()

'klik field untuk memulai input teks'
WebUI.click(findTestObject('Registrasi_Page/textbox_EmailOrPhone'))

'input field email / noHP'
WebUI.setText(findTestObject('Registrasi_Page/textbox_EmailOrPhone'), GlobalVariable.noHPDaftar)

'ambil screenshot'
WebUI.takeScreenshot()

'input field password'
WebUI.setText(findTestObject('Login_Page/textbox_Password'), GlobalVariable.Pass)

'ambil screenshot'
WebUI.takeScreenshot()

'klik checkbox agar tercentang'
WebUI.click(findTestObject('Registrasi_Page/checkbox_Syaratdanketentuan'))

'verifikasi checkbox sudah berhasil dicentang'
WebUI.verifyElementChecked(findTestObject('Registrasi_Page/checkbox_UserConsent'), 0)

'ambil screenshot'
WebUI.takeScreenshot()

'klik button daftar'
WebUI.click(findTestObject('Registrasi_Page/button_Daftar'))

'verifikasi teks berhasil daftar'
WebUI.verifyElementText(findTestObject('Registrasi_Page/label_NotelpValid'), 'Nomor telepon anda valid! Kode OTP telah dikirim ke nomor anda')

'ambil screenshot'
WebUI.takeScreenshot()

'verifikasi element untuk mengisi OTP terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/textbox_OTP'))

'ambil screenshot'
WebUI.takeScreenshot()

