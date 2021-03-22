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

'User click button "Detail"'
WebUI.click(findTestObject('admin/Page_Daftar Tugas - PIJAR/button_btnDetailTugas'))

'User click File Soal'
WebUI.click(findTestObject('admin/Page_Detail Tugas - PIJAR/lihat_file'))

'User click button "Kembali"'
WebUI.click(findTestObject('admin/Page_Detail Tugas - PIJAR/button_Kembali_lihat_file'))

'User click button "Kembali" di halam detail'
WebUI.click(findTestObject('admin/Page_Detail Tugas - PIJAR/button_Kembali'))

