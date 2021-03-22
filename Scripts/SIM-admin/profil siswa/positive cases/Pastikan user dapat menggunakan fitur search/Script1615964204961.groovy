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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Siswa'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Siswa'))

WebUI.delay(1)

WebUI.setText(findTestObject('admin/Page_Profil Siswa - PIJAR/input_cari'), 'QA')

WebUI.click(findTestObject('admin/Page_Profil Siswa - PIJAR/button_DetailTugas'))

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_1234567890_nisn'), '1234567890')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_QA Test'), 'QA Test')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_male'), 'male')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_Bandung_lahir'), 'Bandung')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_01 Maret 2021'), '01 Maret 2021')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_1234567890_nis'), '1234567890')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_Islam'), 'Islam')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_Bandung_alamat'), 'Bandung')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_I-B'), 'I-B')

WebUI.verifyElementText(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/td_qatestgmail.com'), 'qatest@gmail.com')

WebUI.click(findTestObject('admin/Page_Detail Profil Siswa - PIJAR/button_Kembali'))

WebUI.refresh()

