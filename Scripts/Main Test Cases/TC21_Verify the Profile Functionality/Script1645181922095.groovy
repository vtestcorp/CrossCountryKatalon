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

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), findTestData('TestData').getValue(2, 1))

WebUI.setText(findTestObject('Page_Login/txt_Password'), findTestData('TestData').getValue(3, 1))

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Page_AppointmentConfirmation/a_CURA Healthcare_menu-toggle'), GlobalVariable.G_ShortTimeOut)

WebUI.click(findTestObject('Page_AppointmentConfirmation/a_CURA Healthcare_menu-toggle'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Profile'), GlobalVariable.G_ShortTimeOut)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Profile'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Profile'), GlobalVariable.G_ShortTimeOut)

WebUI.comment('Profile Page get displayed after click on Profile option From Hamburger Menu')

WebUI.closeBrowser()

