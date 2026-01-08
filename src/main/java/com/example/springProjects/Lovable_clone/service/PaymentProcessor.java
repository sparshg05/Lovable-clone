package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutRequest;
import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.PortalResponse;

public interface PaymentProcessor {
    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();
}
