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

'Arahkan pointer ke menu Header Jual Mobil'
WebUI.mouseOver(findTestObject('Jual_Cepat/Menu_Jual_Cepat/button_Jual_Mobil'))

'Klik submenu Jual Cepat'
WebUI.click(findTestObject('Jual_Cepat/Menu_Jual_Cepat/button_Jual_Cepat'))

'memastikan user direct ke halaman jual cepat'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Menu_Jual_Cepat/label_cek_estimasi_harga_mobilmu'), FailureHandling.STOP_ON_FAILURE)

'screenshot user direct ke halaman jual cepat'
WebUI.takeScreenshot()

'memastikan kolom input merek mobil muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Cek_Merek_Mobil'))

'memastikan kolom input model mobil muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Pilih_Model'))

'memastikan kolom input tahun produksi muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/dropdownlist_Tahun_Produksi'))

'memastikan kolom input kilometer muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Masukan_Kilometer'))

'memastikan kolom input ekspektasi harga muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Ekspektasi_Harga'))

'memastikan tombol cek harga muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/button_Cek_Harga'))

'input merek mobil'
WebUI.setText(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Cek_Merek_Mobil'), 'honda')

WebUI.click(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/opsi_merek_mobil'), FailureHandling.STOP_ON_FAILURE)

'input model mobil'
WebUI.setText(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Pilih_Model'), 'accord cielo')

WebUI.click(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/opsi_pilih_model'), FailureHandling.STOP_ON_FAILURE)

'input tahun produksi'
WebUI.click(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/dropdownlist_Tahun_Produksi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/opsi_tahun_produksi'), FailureHandling.STOP_ON_FAILURE)

'input kilometer'
WebUI.setText(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Masukan_Kilometer'), '1000')

'input ekspektasi harga'
WebUI.setText(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/textbox_Ekspektasi_Harga'), '200000000')

'screenshot inputan'
WebUI.takeScreenshot()

'klik tombol cek harga'
WebUI.click(findTestObject('Jual_Cepat/Cek_Estimasi_Harga_Mobilmu/button_Cek_Harga'), FailureHandling.STOP_ON_FAILURE)

'memastikan user direct ke halaman selanjutnya, yaitu lengkapi data diri'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/label_lengkapi_data_diri'), FailureHandling.STOP_ON_FAILURE)

'screenshot user direct ke halaman selanjutnya'
WebUI.takeScreenshot()

'memastikan kolom input nama lengkap muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Nama_Lengkap'))

'memastikan kolom input alamat muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Alamat'))

'memastikan kolom input nomor telepon muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Nomor_Telepon'))

'memastikan kolom input email muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Email'))

'memastikan tombol kirim muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/button_Kirim'))

'input nama lengkap'
WebUI.setText(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Nama_Lengkap'), 'solichana')

'input alamat'
WebUI.setText(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Alamat'), 'jl raya adira')

'input nomor telepon'
WebUI.setText(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Nomor_Telepon'), '08123456789')

'input email'
WebUI.setText(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/textbox_Email'), 'hana@gmail.com')

'screenshot inputan'
WebUI.takeScreenshot()

'klik tombol kirim'
WebUI.click(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/button_Kirim'))

'memastikan tombol oke muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/button_oke'))

'screenshot pop up yang muncul'
WebUI.takeScreenshot()

'klik tombol oke'
WebUI.click(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/button_oke'))

'memastikan user kembali ke beranda setelah klik oke pada pop up yang muncul'
WebUI.verifyElementVisible(findTestObject('Jual_Cepat/Lengkapi_Data_Diri/label_Cari_Mobil_Impian'))

'screenshot ketika user direct ke halaman beranda'
WebUI.takeScreenshot()

