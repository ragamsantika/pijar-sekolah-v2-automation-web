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

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
'User click Data Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu\r'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User click button "Tambah Data"\r'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click Input Data'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

'User set text nama guru : \'Jono\'\r'
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Jono')

'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User click button "Tambah Data"'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click Input Data '
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

'User set text nama guru : \'Jono\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Jono')

'User set number nip guru : \'121312131213\''
<<<<<<< HEAD
=======
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'User click Data Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Data Guru'))

'User click Profil Guru on side menu'
WebUI.click(findTestObject('admin/Page_Beranda - PIJAR/span_Profil Guru'))

'User click button "Tambah Data"'
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/button_Tambah Data'))

'User click Input Data '
WebUI.click(findTestObject('admin/Page_Daftar Guru - PIJAR/div_Input Data  Memasukan data Guru secara manual'))

'User set text nama guru : \'Jono\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nama'), 'Jono')

'User set number nip guru : \'121312131213\''
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nip'), '121312131213')

'User set text tempat lahir guru : \'Jakarta\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tempatLahir'), 'Jakarta')

'User set tanggal lahir guru : \'16/02/1994\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__tanggalLahir'), '16/02/1994')

'User click tanggal 16 pada kalender'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_16'))

'User click Pilih Jenis Kelamin untuk memilih jenis kelamin'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Jenis Kelamin'))

<<<<<<< HEAD
'User click \'Laki-Laki\''
=======
<<<<<<< HEAD
<<<<<<< HEAD
'User click \'Laki-Laki\'\r'
=======
'User click \'Laki-Laki\''
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'User click \'Laki-Laki\''
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Laki-laki'))

'User set email guru : \'jono@gmail.com'
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__email'), 'jono@gmail.com')

'User click Pilih Mata Pelajaran untuk memilih mata pelajaran guru'
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Pilih Mata Pelajaran'))

'User click mata pelajaran \'Matematika\''
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/div_Matematika'))

<<<<<<< HEAD
'1990020109920004'
=======
<<<<<<< HEAD
<<<<<<< HEAD
'User set number input nik : 1990020109920004'
=======
'1990020109920004'
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'1990020109920004'
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__nik'), '1990020109920004')

'User set textarea alamat guru : \'Jalan Perjuangan\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/textarea__alamat'), 'Jalan perjuangan')

'User set number no telp guru : \'081213124547\''
WebUI.setText(findTestObject('admin/Page_Add Guru - PIJAR/input__noTelp'), '081213124547')

<<<<<<< HEAD
'User click button "Simpan" untuk menyimpan data guru yang sudah di input'
=======
<<<<<<< HEAD
<<<<<<< HEAD
'User click button "Simpan" untuk menyimpan data guru yang sudah di input\r'
=======
'User click button "Simpan" untuk menyimpan data guru yang sudah di input'
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'User click button "Simpan" untuk menyimpan data guru yang sudah di input'
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_Simpan'))

'User verifikasi pop-up \'Sukses!\''
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/h3_Sukses'), 'Sukses!')

'User verifikasi pop-up \'Profil Guru berhasil disimpan\''
WebUI.verifyElementText(findTestObject('admin/Page_Add Guru - PIJAR/p_Profil Guru berhasil disimpan'), 'Profil Guru berhasil disimpan')

<<<<<<< HEAD
'User click button "OK"'
=======
<<<<<<< HEAD
<<<<<<< HEAD
'User click button "OK"\r'
=======
'User click button "OK"'
>>>>>>> 127c2d619eed0748d7492d44da723e955fc65fd3
=======
'User click button "OK"'
>>>>>>> origin/siswa
>>>>>>> 3d0c386ddb115a76418575be6b49f1ea70c2e9b4
WebUI.click(findTestObject('admin/Page_Add Guru - PIJAR/button_OK'))

WebUI.refresh()

