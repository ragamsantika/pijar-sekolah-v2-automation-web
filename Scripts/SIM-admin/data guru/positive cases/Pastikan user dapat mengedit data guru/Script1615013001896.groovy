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

'Menampilkan list guru'
WebUI.delay(1)

'User click icon edit pada guru jono'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_btnEdit'))

'User delete name guru'
WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

<<<<<<< HEAD
=======
'User set text input name guru : Jona'
>>>>>>> origin/siswa
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nama'), 'Jona')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nip'), '141514151415')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

<<<<<<< HEAD
<<<<<<< HEAD
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), 'Jakarta')

WebUI.doubleClick(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))
=======
=======
>>>>>>> origin/siswa
WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__tempatLahir'), 'Makassar')

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__email'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__email'), 'jona@gmail.com')
<<<<<<< HEAD
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
>>>>>>> origin/siswa

WebUI.sendKeys(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('admin/Page_Edit Guru - PIJAR/input__nik'), '1992929192919291')

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

