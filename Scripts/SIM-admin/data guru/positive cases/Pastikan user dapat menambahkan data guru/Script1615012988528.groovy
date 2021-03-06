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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Jono')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nip'), '121312131213')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tempatLahir'), 'Jakarta')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tanggalLahir'), '16/02/1994')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_16'))

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__email'), 'jono@gmail.com')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Mata Pelajaran'))

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Matematika'))

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nik'), '1234567812345678')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/textarea__alamat'), 'Jalan perjuangan')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__noTelp'), '081213124547')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/p_Profil Guru berhasil disimpan'), 'Profil Guru berhasil disimpan')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

WebUI.refresh()

