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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.momobil.id/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Home_Page/Button_MasukDaftar'))

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Home_Page/Button_MasukDaftar'), 0)

WebUI.verifyTextPresent('masuk ke akun anda', false)

WebUI.setText(findTestObject('Login_Page/textarea_EmailOrPhone'), GlobalVariable.User)

WebUI.verifyElementNotClickable(findTestObject('Login_Page/button_Masuk'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textarea_Password'), GlobalVariable.Pass)

WebUI.verifyElementClickable(findTestObject('Login_Page/button_Masuk'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login_Page/button_Masuk'))

WebUI.verifyElementVisible(findTestObject('Home_Page/Button_User'))

WebUI.takeScreenshot()

