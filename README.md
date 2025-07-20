CASH2CARAT

💡 What This App Does (in 1 sentence):
A hyperlocal platform that lets users invest ₹10+ daily in gold and redeem it from trusted local jewellery shops — you just connect both parties via a mobile + web app.
________________________________________
🎯 Target Audience
•	🧑‍🤝‍🧑 Local people (Tier 2/3 city folks, small savers, women, daily earners)
•	🧑‍🏭 Local jewellery shop owners who want digital customers without tech skills
________________________________________
🚀 Features You’ll Provide (User + Shop)
🔓 1. For Customers:
Feature	Description
✅ Daily Gold SIP	Invest ₹10–₹500 daily
✅ Email-based OTP Login	Simple secure login
✅ Digital Passbook	View gold grams, ₹ invested, history
✅ Shop List	See nearby shops with live gold rate
✅ Redeem Gold	Walk-in or request gold from nearby shop
✅ Referral Program	Get bonus grams/money for referrals
✅ News	Gold and silver rates news and chart(future: traders advice)
	
________________________________________
🏬 2. For Jewellery Shop Owners:
Feature	Description
✅ Shop Registration	KYC + bank setup
✅ Gold Product Listing	Add live price per gram, offers
✅ Customer List	See who’s saving with them
✅ Redeem Requests	Fulfill gold orders when maturity reached
✅ Earnings Report	View commissions, completed orders
✅ Daily Dashboard	Investments received, requests pending
________________________________________
🔐 Backend Flow Summary:
•	Tech: Java Spring Boot (secure, scalable)
•	Login: Email OTP (via JavaMail)
•	Data Access: ONLY via MySQL stored procedures
•	Security: Spring Security + JWT (optional later)
•	Notifications: Email + Push (FCM)
________________________________________
💾 Database Setup (All via Stored Procedures)
Table	Purpose
users	Stores email, KYC info
otps	Stores OTP with expiry
investments	Tracks user SIPs
jewellers	Shop info, gold price, offers
redemptions	Tracks when user requests gold
transactions	Ledger-style flow of ₹ and grams
referrals	Optional viral loop table
________________________________________
📱 App Stack:
Layer	Tech
Mobile	React Native (Android + iOS)
Web	React.js (for admin + user dashboard)
Backend	Spring Boot
DB	MySQL with all logic in stored procedures
Email	JavaMailSender (SMTP-based)
Hosting	Render / Railway / Vercel
Auth	Email OTP
Payments	Razorpay UPI (later)
________________________________________
💰 Monetization:
Stream	How You Earn
💸 Service Fee	₹1 per ₹10 SIP
💼 Shop Commission	1–2% on redemption
🥇 Premium Plan	₹49/month for gold clubs
📢 Ads / Cross-sells	Sell gold loans, insurance later
________________________________________
🧭 Expansion Plan:
Phase	Goal
✅ Phase 1	Launch in Chennai with 3–5 shops
🔄 Phase 2	Expand to nearby towns (Madurai, Coimbatore)
🌐 Phase 3	Enable shop onboarding flow via app
🪙 Phase 4	Launch Gold+Silver savings, loan on savings
💳 Phase 5	Issue prepaid gold card (like Jar)

