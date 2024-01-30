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

WebUI.click(findTestObject('Home_Page/button_mobilBaru'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Katalog_mobilBaru/label_unitNcar'))

WebUI.click(findTestObject('Katalog_mobilBaru/label_unitNcar'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('PDP/label_varian'))

WebUI.click(findTestObject('PDP/button_ubah'))

WebUI.verifyElementVisible(findTestObject('PDP/label_OTRBekasi'))

WebUI.click(findTestObject('PDP/label_OTRBekasi'))

WebUI.click(findTestObject('PDP/button_pilihOTR'))

WebUI.verifyElementVisible(findTestObject('PDP/label_cicilanOTR'))

WebUI.verifyElementVisible(findTestObject('PDP/button_ajukanPembiayaan'))

WebUI.click(findTestObject('PDP/button_ajukanPembiayaan'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_namaLengkap'), 'Testing Yudha')

WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_email'), 'qamomobil@gmail.co.id')

WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_NomorHP'), '081265021613')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Halaman_Konfirmasi/button_submit'))

WebUI.click(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

WebUI.takeScreenshot()

