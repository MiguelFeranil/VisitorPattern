class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " offers Unlimited Calls and Texts.";
        } else {
            return telcoName + " does not offer Unlimited Calls and Texts.";
        }
    }
}