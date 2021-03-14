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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Navigate to URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-admin/login/positive cases/Pastikan admin bisa login'), [('username') : 'pijarsekolahv2@gmail.com'
        , ('password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('admin/Page_Beranda - PIJAR/span_Akademik'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Daftar Pelajaran'))

WebUI.click(findTestObject('admin/Page_Daftar Pelajaran - PIJAR/button_Tambah Pelajaran'))

WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Kode Pelajaran_kodePelajaran'), 'IPA')

WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/input_Mata Pelajaran_mataPelajaran'), 'Ilmu Pengetahuan Alam')

WebUI.setText(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/textarea_Deskripsi_deskripsi'), 'Ilmu Pengetahun Alam')

WebUI.click(findTestObject('admin/Page_Tambah Daftar Pelajaran - PIJAR/button_Simpan'))

