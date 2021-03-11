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

WebUI.callTestCase(findTestCase('SIM-guru/login/positive cases/Pastikan guru bisa login'), [('username') : 'jono@gmail.com'
        , ('password') : '160294'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SIM-guru/login/positive cases/TC-Pop-up kehadiran'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/span_Data Guru'))

WebUI.click(findTestObject('guru/Page_Beranda - PIJAR/span_Profil Guru'))

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_Jono'), 'Jono')

WebUI.verifyElementText(findTestObject('guru/Page_Daftar Guru - PIJAR/td_jonogmailcom'), 'jono@gmail.com')

WebUI.refresh()

