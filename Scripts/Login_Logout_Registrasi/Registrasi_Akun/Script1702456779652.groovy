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

WebUI.openBrowser('https://uat.momobil.id/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Home_Page/Button_MasukDaftar'))

WebUI.verifyTextPresent('masuk ke akun anda', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login_Page/button_DaftarDisini'))

WebUI.verifyTextPresent('daftar sekarang', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textarea_EmailOrPhone'), noHP)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textarea_Password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Registrasi_Page/checkbox_Syaratdanketentuan'))

WebUI.verifyElementChecked(findTestObject('Registrasi_Page/checkbox_Syaratdanketentuan'), 0)

WebUI.takeScreenshot()

