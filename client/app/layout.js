"use client";
import "./globals.css";
import { StoreProvider } from "@/config/StoreProvider";
export default function RootLayout({ children }) {
  return (
    <StoreProvider>
      <html lang="en">
        <body className="font-primary">{children}</body>
      </html>
    </StoreProvider>
  );
}
