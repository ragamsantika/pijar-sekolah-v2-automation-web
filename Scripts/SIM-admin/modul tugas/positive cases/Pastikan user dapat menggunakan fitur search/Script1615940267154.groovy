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

'User click button filter'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/tombol_filter'))

'User click Mata Pelajaran'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/span_Mata Pelajaran'))

'User click Mata Pelajaran "Bahasa Inggris"'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/span_Bahasa Inggris'))

'User click Kelas'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/span_Kelas'))

'User click Kelas "I-B"'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/span_I-B'))

'User click button "Terapkan"'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/button_Terapkan'))

'User click Cari Tugas'
WebUI.focus(findTestObject('admin/Page_Daftar Tugas - PIJAR/Page_Daftar Tugas - PIJAR/div_Tambah ModulTugas__2k_99Q-oB1hRS2XD1Pq1_P'))

'User mengisi tugas yang dicari "bahasa inggris"'
WebUI.setText(findTestObject('admin/Page_Daftar Tugas - PIJAR/Page_Daftar Tugas - PIJAR/input_Tambah ModulTugas__2PgA8YDgtyQ3pwmTXHYS_6'), 
    'bahasa inggris')

