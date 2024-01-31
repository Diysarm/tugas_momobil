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

WebUI.click(findTestObject('pengajuan_MomobilPro/ajukan_pembiayaan/produk_dipilih'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Detail Mobil Momobilpro  Momobil/image_produkdipilih'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Detail Mobil Momobilpro  Momobil/button_AjukanPembiayaan'))

WebUI.click(findTestObject('pengajuan_MomobilPro/Page_Detail Mobil Momobilpro  Momobil/button_AjukanPembiayaan'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/label_KonfirmasiPengajuan'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input_NamaLengkap'))

WebUI.setText(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input_NamaLengkap'), 'Nurul Tugas QA')

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input__email'))

WebUI.setText(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input__email'), 'qaauto@gmail.com')

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input__phoneNo'))

WebUI.setText(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/input__phoneNo'), '082567980122')

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/ajukan_pembiayaan/button_Submitkonfirmasi'))

WebUI.click(findTestObject('pengajuan_MomobilPro/ajukan_pembiayaan/button_Submitkonfirmasi'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/label_Apakahandayakin'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/button_Submit'))

WebUI.click(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/button_Submit'))

WebUI.verifyElementVisible(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/button_Oke'))

WebUI.click(findTestObject('pengajuan_MomobilPro/Page_Konfirmasi Pengajuan  Momobil/button_Oke'))

