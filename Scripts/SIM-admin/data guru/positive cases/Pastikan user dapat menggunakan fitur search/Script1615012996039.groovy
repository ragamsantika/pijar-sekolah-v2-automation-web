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

'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User set text untuk find guru dengan nama \'Jono\''
WebUI.setText(findTestObject('admin/Page_Daftar Guru - PIJAR/input_Tambah Data_search'), 'Jono')

'User click icon "Eye" untuk melihat detail guru Jono'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnDetail'))

<<<<<<< HEAD
'User click button "Kembali"'

=======
<<<<<<< HEAD
<<<<<<< HEAD
'User click button "Kembali"\r'
=======
'User click button "Kembali"'
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'User click button "Kembali"'
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.click(findTestObject('admin/Page_Detail Guru - PIJAR/button_Kembali'))

WebUI.refresh()

