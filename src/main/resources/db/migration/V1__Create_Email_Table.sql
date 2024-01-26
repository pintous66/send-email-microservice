CREATE TABLE email (
    emailId SERIAL PRIMARY KEY,
    ownerRef VARCHAR(255) NOT NULL,
    emailFrom VARCHAR(255) NOT NULL,
    emailTo VARCHAR(255) NOT NULL,
    subject VARCHAR(255),
    text TEXT,
    sendDateEmail TIMESTAMP,
    statusEmail VARCHAR(50)
);