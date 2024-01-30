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

'hover mouse ke mitra dealer'
WebUI.mouseOver(findTestObject('Home_Page/hyperlink_MitraDealer'))

'verifikasi element button dealer rekanan terlihat'
WebUI.verifyElementVisible(findTestObject('Home_Page/button_DealerRekanan'))

'ambil screenshot'
WebUI.takeScreenshot()

'klik button dealer rekanan'
WebUI.click(findTestObject('Home_Page/button_DealerRekanan'))

'verifikasi teks dealer rekanan'
WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_DealerRekanan'), 'dealer rekanan')

'ambil screenshot'
WebUI.takeScreenshot()

'scroll page ke posisi tertentu'
WebUI.scrollToPosition(20, 0)

'ambil screenshot'
WebUI.takeScreenshot()

'klik button dealer abadi megah motor'
WebUI.click(findTestObject('Dealer_Rekanan_Page/button_DealerAbadaiMegahMotor'))

'verifikasi terdapat teks "ABADI MEGAH MOTOR"'
WebUI.verifyElementText(findTestObject('Dealer_Rekanan_Page/label_AbadiMegahMotor'), 'ABADI MEGAH MOTOR')

'ambil screenshot'
WebUI.takeScreenshot()

'scroll ke element button promo'
WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

'ambil screenshot'
WebUI.takeScreenshot()

'klik checkbox filter toyota'
WebUI.click(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))

'delay 4 detik'
WebUI.delay(4)

'scroll ke element button promo'
WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

'ambil screenshot'
WebUI.takeScreenshot()

'ambil teks jumlah mobil setelah filter dan masukkan kedalam variable jumlah'
jumlah = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

'melakukan parsing dari teks String yang diambil dari jumlah menjadi integer'
mobil = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah)

'melakukan verifikasi filter dengan data yang muncul di page sudah sesuai'
CustomKeywords.'packageKeyword.SplitText.splitTextMobil'(mobil, findTestObject('Dealer_Rekanan_Page/label_HeaderMobil', 
        [(GlobalVariable.i) : GlobalVariable.i]))

'klik button checkbox toyota'
WebUI.click(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'))

'delay 4 detik'
WebUI.delay(4)

'ambil screenshot'
WebUI.takeScreenshot()

'scroll ke element checkbox toyota'
WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/checkbox_Toyota'), 0)

'hapus field tahun produksi MIN'
WebUI.clearText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'))

'ambil screenshot'
WebUI.takeScreenshot()

'input teks untuk filter tahun produksi'
WebUI.setText(findTestObject('Dealer_Rekanan_Page/textbox_FilterTahunProduksiMIN'), GlobalVariable.ThnProduksiMin)

'ambil screenshot'
WebUI.takeScreenshot()

'scroll ke element button promo'
WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/button_Promo'), 0)

'klik label untuk lanjut filter'
WebUI.click(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

'delay 4 detik'
WebUI.delay(4)

'ambil screenshot'
WebUI.takeScreenshot()

'ambil teks jumlah filter'
jumlah2 = WebUI.getText(findTestObject('Dealer_Rekanan_Page/label_DitemukanJumlahMobil'))

'melakukan parsing dari teks String yang diambil dari jumlah2 menjadi integer'
tahunProduksi = CustomKeywords.'packageKeyword.SplitText.stringToInteger'(jumlah2)

'verifikasi filter tahun mobil sudah sesuai'
CustomKeywords.'packageKeyword.SplitText.verifyFilterTahun'(tahunProduksi, findTestObject('Dealer_Rekanan_Page/label_TahunMobilImg', 
        [(GlobalVariable.j) : GlobalVariable.j]))

'scroll ke element label abadi megah motor'
WebUI.scrollToElement(findTestObject('Dealer_Rekanan_Page/label_AbadiMegahMotor'), 0)

'ambil screenshot'
WebUI.takeScreenshot()

'klik button promo'
WebUI.click(findTestObject('Dealer_Rekanan_Page/button_Promo'))

'verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Dealer_Rekanan_Page/label_HalamanKosongPromo'))

'ambil screenshot'
WebUI.takeScreenshot()

'klik button aktivitas'
WebUI.click(findTestObject('Dealer_Rekanan_Page/button_Aktivitas'))

'verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Dealer_Rekanan_Page/label_HalamanKosongAktivitas'))

'ambil screenshot'
WebUI.takeScreenshot()

'klik button catatan'
WebUI.click(findTestObject('Dealer_Rekanan_Page/button_Catatan'))

'verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Dealer_Rekanan_Page/label_CatatanSosialMedia'))

'ambil screenshot'
WebUI.takeScreenshot()

