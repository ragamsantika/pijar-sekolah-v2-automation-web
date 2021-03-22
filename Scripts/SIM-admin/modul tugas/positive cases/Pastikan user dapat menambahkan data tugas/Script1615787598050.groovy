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

'User click button "Tambah Modul Tugas"\r\n'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/button_Tambah ModulTugas'))

'User click Pilih Guru'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih Guru'))

'User click Nama Guru "Danila Lestari"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Danian Lestari'))

'User click Pilih Mata Pelajaran'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih Mata Pelajaran'))

'User click Nama Mata Pelajaran "Indonesia"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_Indonesia'))

'User click Judul Modul Tugas dan mengisi Judul Tugas "Mencoba menambah data tugas dengan automatic test"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'), 'Mencoba menambah data tugas dengan automatic test')

'User click Pilih Kelas'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/dev_pilih_kelas'))

'User click kelas "I-B"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_I-B'))

'User click Pilih Kelas Kembali'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/dev_pilih_kelas'))

'User click kelas "II-B"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/div_II-A'))

'User click button hapus "x" di kelas "II-B"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/hapus_kelas'))

'User click Tanggal Penggerjaan dan click tanggal "25/03/2021"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__tglPengerjaan'), '25/03/2021')

'User click Judul Modul Tugas'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'))

'User click Waktu Pengerjaan dan mengisi waktu pengerjaan "08:00"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__waktuPengerjaan'), '08:00')

'User click Judul Modul Tugas'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'))

'User click Tanggal Pengumpulan Tugas dan click tanggal "25/03/2021"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__tglPengumpulan'), '25/03/2021')

'User click Judul Modul Tugas'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'))

'User click Waktu Pengumpulan Tugas dan mengisi waktu pengumumpulan tugas "17:00"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input__waktuPengumpulan'), '17:00')

'User click Judul Modul Tugas'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/input__judul'))

'User click Pilih File dan mengupload file'
WebUI.uploadFile(findTestObject('admin/Page_Add Tugas - PIJAR/div_Pilih File'), file)

'User click Link File dan mengisi link file "https://googole.com"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/input_Link File_linkFile'), 'https://google.com')

'User click Deskripsi dan mengisi deskripsi "Memcoba automatic test tugas pertama"'
WebUI.setText(findTestObject('admin/Page_Add Tugas - PIJAR/textarea_Deskripsi_deskripsi'), 'Memcoba automatic test tugas pertama')

'User click button "Simpan"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/button_Simpan'))

'Verify Element Text "Sukses!"'
WebUI.verifyElementText(findTestObject('admin/Page_Add Tugas - PIJAR/h3_Sukses'), 'Sukses!')

'User click button "ok"'
WebUI.click(findTestObject('admin/Page_Add Tugas - PIJAR/button_OK'))

