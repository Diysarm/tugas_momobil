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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'buka browser'
WebUI.openBrowser('')

'pergi ke url momobil'
WebUI.navigateToUrl('https://uat.momobil.id/')

'maximize window browser'
WebUI.maximizeWindow()

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk untuk login'
WebUI.click(findTestObject('Home_Page/Button_Masuk'))

'delay 4 detik untuk menunggu web load'
WebUI.delay(4)

'verifikasi teks yang ada pada header login'
WebUI.verifyTextPresent('masuk ke akun anda', false)

'input no HP untuk login'
WebUI.setText(findTestObject('Login_Page/textbox_EmailOrPhone'), GlobalVariable.noHPLogin)

'verifikasi button masuk tidak bisa diklik setelah isi no HP'
WebUI.verifyElementNotClickable(findTestObject('Login_Page/button_Masuk'))

'ambil screenshot'
WebUI.takeScreenshot()

'input password untuk login'
WebUI.setText(findTestObject('Login_Page/textbox_Password'), GlobalVariable.Pass)

'verifikasi button masuk sudah bisa diklik setelah input password'
WebUI.verifyElementClickable(findTestObject('Login_Page/button_Masuk'))

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk untuk login'
WebUI.click(findTestObject('Login_Page/button_Masuk'))

'verifikasi jika sudah berhasil login'
WebUI.verifyElementVisible(findTestObject('Home_Page/Button_User'))

'ambil screenshot'
WebUI.takeScreenshot()

