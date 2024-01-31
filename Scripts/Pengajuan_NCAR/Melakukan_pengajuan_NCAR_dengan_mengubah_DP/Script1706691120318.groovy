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

'membuka browser '
WebUI.openBrowser('https://uat.momobil.id/')

WebUI.maximizeWindow()

'klik button mobil baru'
WebUI.click(findTestObject('Home_Page/button_mobilBaru'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'verifikasi unit mobil sudah muncul'
WebUI.verifyElementVisible(findTestObject('Katalog_mobilBaru/label_unitNcar'))

'klik unit mobil'
WebUI.click(findTestObject('Katalog_mobilBaru/label_unitNcar'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'verifikasi wording Uang Muka sudah muncul'
WebUI.verifyElementVisible(findTestObject('PDP/label_DP'))

'input harga UAng Muka'
WebUI.setText(findTestObject('PDP/textbox_DP'), '90000000')

'verifikasi cicilan sudah terupdate dan sudah sesuai'
WebUI.verifyElementVisible(findTestObject('PDP/label_cicilanDPNCAR'))

'verifikasi button ajukan pembiayaan sudah muncul'
WebUI.verifyElementVisible(findTestObject('PDP/button_ajukanPembiayaan'))

'klik button ajukan pembiayaan'
WebUI.click(findTestObject('PDP/button_ajukanPembiayaan'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'input nama lengkap'
WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_namaLengkap'), 'Testing Yudha')

'input email'
WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_email'), 'qamomobil@gmail.co.id')

'input no hp'
WebUI.setText(findTestObject('Halaman_Konfirmasi/textbox_NomorHP'), '081265021613')

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

'klik button submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_submit'))

'klik button konfirmasi submit'
WebUI.click(findTestObject('Halaman_Konfirmasi/button_konfirmasiSubmit'))

'Ambil SS untuk evidence'
WebUI.takeScreenshot()

