# Test-skleptest.pl

### Test plan: ###

- Site: http://skleptest.pl/
- Test Range: functional tests
- Test object: login register and cart page
- Test environment: Windows - Webdriver Chrome(107.0.5304.107)
- Test tool: Selenium Java



| **ID** | 1 |
|:---:|:---:|
| **Process** | RegisterTest |
| **Preconditions** | The user is not registered |
| **Steps** | openMyAccountPage<br>registerUser(ValidData)<br>click on registerButton |
| **Expected result** | New account registered |
| **Priority** | H |

| **ID** | 2 |
|:---:|:---:|
| **Process** | registerUser(WithSameEmail) |
| **Preconditions** | The user is already registered |
| **Steps** | openMyAccountPage<br>registerUser(InvalidData-reused email)<br>click on registerButton |
| **Expected result** | You cannot register again using the same email |
| **Priority** | H |

| **ID** | 3 |
|:---:|:---:|
| **Process** | logInTest |
| **Preconditions** | The user is registered |
| **Steps** | openMyAccountPage<br>loginUser(ValidData)<br>click on loginButton |
| **Expected result** | The user is logged |
| **Priority** | H |

| **ID** | 4 |
|:---:|:---:|
| **Process** | logInTestWithInvalidEmail |
| **Preconditions** | The user is not registered |
| **Steps** | openMyAccountPage<br>loginUser(InvalidData)<br>click on loginButton |
| **Expected result** | The user isn't logged |
| **Priority** | H |

| ID | 5 |
|:---:|:---:|
| **Process** | checkoutTest |
| **Preconditions** | The user is not registered |
| **Steps** | addProductsAndOpenCartPage<br>openAddressDetails<br>fillAddressDetails<br>click on placeOrderButton |
| **Expected result** | The user can place an order |
| **Priority** | H |

| ID | 6 |
|:---:|:---:|
| **Process** | ContactTest |
| **Preconditions** | The user is not registered |
| **Steps**  | openContactPage <br>fillContactDetails<br>click on submitButton |
| **Expected result** | The user can send a message via the contact form |
| **Priority** | H |

### Bugs reports ###
#### Bug 1 ####
You can register with the same email and password several times

Steps: 
- openMyAccountPage
- registerUser(InvalidData-reused email)
- click on registerButton


**Expected result**: You cannot register again using the same email.

**Actual result**: The system allows you to use the same email several times.

**Severity: Critical**

#### Bug 2 ####
After placing an order, the names of the ordered products are not displayed

Steps: 
- addProductsAndOpenCartPage
- openAddressDetails
- fillAddressDetails
- click on placeOrderButton
- check the ordered products


**Expected result** : You can see what you ordered

**Actual result** : No visibility of ordered products

**Severity** : Normal

[screenshot](https://i.imgur.com/U20TF4r.png)

#### Bug 3 ####
The contact form doesn't work properly

Steps: 
- openContactPage
- fillContactDetails
- click on submitButton


**Expected result** : You can send a message via the contact form

**Actual result** : You can't send a message via the contact form

**Severity** : **Critical**

[screenshot](https://i.imgur.com/gw2mYIM.png)
