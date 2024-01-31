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

'Klik button Mobil Baru'
WebUI.click(findTestObject('Home_Page/button_mobilBaru'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'Verifikasi apakah unit mobil ada'
WebUI.verifyElementVisible(findTestObject('Katalog_mobilBaru/label_unitNcar'))

'Klik unit mobil'
WebUI.click(findTestObject('Katalog_mobilBaru/label_unitNcar'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'verifikasi apakah button Ajukan Pembiayaan muncul'
WebUI.verifyElementVisible(findTestObject('PDP/button_ajukanPembiayaan'))

'Klik button ajukan pembiayaan'
WebUI.click(findTestObject('PDP/button_ajukanPembiayaan'))

'Verifikasi apakah button submit muncul'
WebUI.verifyElementVisible(findTestObject('Halaman_Konfirmasi/button_submit'))

'Klik button Submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_submit'))

'Verifikasi apakah button konfirmsi Submit muncul'
WebUI.verifyElementVisible(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

'Klik button konfirmasi Submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()