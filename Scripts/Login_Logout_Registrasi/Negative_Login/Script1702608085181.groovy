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

'buka browser dan ke url uat momobil'
WebUI.openBrowser('https://uat.momobil.id/')

'maximize window browser'
WebUI.maximizeWindow()

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk'
WebUI.click(findTestObject('Home_Page/Button_Masuk'))

'tunggu 4 detik'
WebUI.delay(4)

'verifikasi terdapat text "masuk ke akun anda"'
WebUI.verifyTextPresent('masuk ke akun anda', false)

'ambil screenshot'
WebUI.takeScreenshot()

'verifikasi button masuk tidak dapat diklik sebelum isi data'
WebUI.verifyElementNotClickable(findTestObject('Login_Page/button_Masuk'))

'input email / noHP'
WebUI.setText(findTestObject('Login_Page/textbox_EmailOrPhone'), GlobalVariable.User)

'verifikasi button masuk tidak dapat diklik'
WebUI.verifyElementNotClickable(findTestObject('Login_Page/button_Masuk'))

'ambil screenshot'
WebUI.takeScreenshot()

'hapus isi field email / noHP'
WebUI.clearText(findTestObject('Login_Page/textbox_EmailOrPhone'))

'ambil screenshot'
WebUI.takeScreenshot()

'input password'
WebUI.setText(findTestObject('Login_Page/textbox_Password'), GlobalVariable.Pass)

'ambil screenshot'
WebUI.takeScreenshot()

'verifikasi button tidak bisa diklik'
WebUI.verifyElementNotClickable(findTestObject('Login_Page/button_Masuk'))

'ambil screenshot'
WebUI.takeScreenshot()

'input field email / noHP'
WebUI.setText(findTestObject('Login_Page/textbox_EmailOrPhone'), 'heyo@mailinator.com')

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk'
WebUI.click(findTestObject('Login_Page/button_Masuk'))

'verifikasi error message sesuai'
WebUI.verifyElementText(findTestObject('Login_Page/label_ErrorMessage'), 'Invalid Username/Password.')

'ambil screenshot'
WebUI.takeScreenshot()

'hapus field email / noHP'
WebUI.clearText(findTestObject('Login_Page/textbox_EmailOrPhone'))

'refresh page'
WebUI.refresh()

'ambil screenshot'
WebUI.takeScreenshot()

'input field email / noHP'
WebUI.setText(findTestObject('Login_Page/textbox_EmailOrPhone'), GlobalVariable.User)

'ambil screenshot'
WebUI.takeScreenshot()

'input password'
WebUI.setText(findTestObject('Login_Page/textbox_Password'), '1234567890')

'ambil screenshot'
WebUI.takeScreenshot()

'klik button masuk'
WebUI.click(findTestObject('Login_Page/button_Masuk'))

'verifikasi error message'
WebUI.verifyElementText(findTestObject('Login_Page/label_ErrorMessage'), 'Invalid Username/Password.')

'ambil screenshot'
WebUI.takeScreenshot()

