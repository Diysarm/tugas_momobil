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

'klik button mobil bekas'
WebUI.click(findTestObject('Home_Page/button_mobilBekas'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'verifikasi unit mobil sudah muncul'
WebUI.verifyElementVisible(findTestObject('Katalog_mobilBekas/label_unitUcar'))

'klik unit mobil'
WebUI.click(findTestObject('Katalog_mobilBekas/label_unitUcar'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'verifikasi button ajukan pembiayaan muncul'
WebUI.verifyElementVisible(findTestObject('PDP/button_ajukanPembiayaan'))

'klik button ajukan pembiayaan'
WebUI.click(findTestObject('PDP/button_ajukanPembiayaan'))

'verifikasi button submit'
WebUI.verifyElementVisible(findTestObject('Halaman_Konfirmasi/button_submit'))

'klik button submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_submit'))

'verifikasi button konfirmasi submit'
WebUI.verifyElementVisible(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

'klik button konfirmasi submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()