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

WebUI.comment('Verification of click on Go To Homepage Button on Appointment Page')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.comment('You are now Home Page of Cura HealthCare System')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.comment('User is On Login Page Now')

WebUI.setText(findTestObject('Page_Login/txt_UserName'), findTestData('TestData').getValue(2, 1))

WebUI.setText(findTestObject('Page_Login/txt_Password'), findTestData('TestData').getValue(3, 1))

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/td_28'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_AppointmentConfirmation/h2_Appointment Confirmation'), GlobalVariable.G_ShortTimeOut)

WebUI.verifyElementPresent(findTestObject('Page_AppointmentConfirmation/a_Go to Homepage'), GlobalVariable.G_ShortTimeOut)

WebUI.comment('Go To Hmepage option is displayed on page')

WebUI.click(findTestObject('Page_AppointmentConfirmation/a_Go to Homepage'))

WebUI.verifyElementPresent(findTestObject('Page_AppointmentConfirmation/a_Make Appointment'), 0)

WebUI.comment('User Navigated to the Home Page after click on Go to Homepage')

WebUI.closeBrowser()

