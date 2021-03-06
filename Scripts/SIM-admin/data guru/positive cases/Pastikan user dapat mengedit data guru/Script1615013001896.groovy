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

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnEdit'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), 'Jono Aja nih')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), '121312131213')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), 'Jakarta')

WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tanggalLahir'), '16/02/1994')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_16'))

WebUI.doubleClick(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), '1234567812345678')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/textarea_Jalan perjuangan'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/textarea_Jalan perjuangan'), 'Jalan perjuangan')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__noTelp'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__noTelp'), '081213124547')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

WebUI.verifyElementText(findTestObject('admin/Page_Edit Guru - PIJAR/h3_Sukses'), 'Sukses!')

WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('admin/Page_Detail Guru - PIJAR/button_Kembali'))

WebUI.refresh()

