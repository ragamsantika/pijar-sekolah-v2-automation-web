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

'User click Modul Tugas on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_ModulTugas'))

'User click Daftar Modul Tugas on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar ModulTugas'))

'User click button "Ubah" di list tugas'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/button_ubah_tugas'))

'User click Pilih Guru'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_Danian Lestari'))

'User click Nama Guru "Fariz"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_Fariz'))

'User click Mata Pelajaran'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_Pilih Mata Pelajaran'))

'User click Mata Pelajaran "Fisika"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_Fisika'))

'User click Judul Tugas dan mengisi judul tugas "Mencoba mengubah data tugas dengan automatic test"'
WebUI.setText(findTestObject('admin/Page_Edit Tugas - PIJAR/input__judul'), 'Mencoba mengubah data tugas dengan automatic test')

'User click Pilih Kelas'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_pilih kelas'))

'User click Kelas "I-B"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_I-B'))

'User click Pilih Kelas kembali'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_pilih kelas'))

'User click kelas "II-B"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/div_II-B'))

'User click Judul Modul Tugas'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/input__judul'))

'User click button "x" hapus'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/hapus_file'))

'User click Pilih File dan mengupload file'
WebUI.uploadFile(findTestObject('admin/Page_Edit Tugas - PIJAR/div_Pilih File'), file)

'User click Link File dan mengisi link file "https://google.com"'
WebUI.setText(findTestObject('admin/Page_Edit Tugas - PIJAR/input_Link File_linkFile'), 'https://google.com')

'User click Deskripsi dan mengisi deskripsi "Mencoba mengubah data dengan menggunakan automatic test"'
WebUI.setText(findTestObject('admin/Page_Edit Tugas - PIJAR/textarea_Mencoba Mengubah data'), 'Mencoba mengubah data dengan menggunakan automatic test')

'User click button "Simpan"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/button_Simpan'))

'Verify Element Text "Sukses!"'
WebUI.verifyElementText(findTestObject('admin/Page_Edit Tugas - PIJAR/h3_Sukses'), 'Sukses!')

'User click button "ok"'
WebUI.click(findTestObject('admin/Page_Edit Tugas - PIJAR/button_OK'))

